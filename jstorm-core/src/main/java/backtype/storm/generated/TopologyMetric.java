/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-27")
public class TopologyMetric implements org.apache.thrift.TBase<TopologyMetric, TopologyMetric._Fields>, java.io.Serializable, Cloneable, Comparable<TopologyMetric> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TopologyMetric");

  private static final org.apache.thrift.protocol.TField TOPOLOGY_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("topologyMetric", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMPONENT_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("componentMetric", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField WORKER_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("workerMetric", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField TASK_METRIC_FIELD_DESC = new org.apache.thrift.protocol.TField("taskMetric", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopologyMetricStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopologyMetricTupleSchemeFactory());
  }

  private MetricInfo topologyMetric; // required
  private Map<String,MetricInfo> componentMetric; // required
  private Map<String,MetricInfo> workerMetric; // required
  private Map<Integer,MetricInfo> taskMetric; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOPOLOGY_METRIC((short)1, "topologyMetric"),
    COMPONENT_METRIC((short)2, "componentMetric"),
    WORKER_METRIC((short)3, "workerMetric"),
    TASK_METRIC((short)4, "taskMetric");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPOLOGY_METRIC
          return TOPOLOGY_METRIC;
        case 2: // COMPONENT_METRIC
          return COMPONENT_METRIC;
        case 3: // WORKER_METRIC
          return WORKER_METRIC;
        case 4: // TASK_METRIC
          return TASK_METRIC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_METRIC, new org.apache.thrift.meta_data.FieldMetaData("topologyMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class)));
    tmpMap.put(_Fields.COMPONENT_METRIC, new org.apache.thrift.meta_data.FieldMetaData("componentMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class))));
    tmpMap.put(_Fields.WORKER_METRIC, new org.apache.thrift.meta_data.FieldMetaData("workerMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class))));
    tmpMap.put(_Fields.TASK_METRIC, new org.apache.thrift.meta_data.FieldMetaData("taskMetric", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TopologyMetric.class, metaDataMap);
  }

  public TopologyMetric() {
  }

  public TopologyMetric(
    MetricInfo topologyMetric,
    Map<String,MetricInfo> componentMetric,
    Map<String,MetricInfo> workerMetric,
    Map<Integer,MetricInfo> taskMetric)
  {
    this();
    this.topologyMetric = topologyMetric;
    this.componentMetric = componentMetric;
    this.workerMetric = workerMetric;
    this.taskMetric = taskMetric;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyMetric(TopologyMetric other) {
    if (other.is_set_topologyMetric()) {
      this.topologyMetric = new MetricInfo(other.topologyMetric);
    }
    if (other.is_set_componentMetric()) {
      Map<String,MetricInfo> __this__componentMetric = new HashMap<String,MetricInfo>(other.componentMetric.size());
      for (Map.Entry<String, MetricInfo> other_element : other.componentMetric.entrySet()) {

        String other_element_key = other_element.getKey();
        MetricInfo other_element_value = other_element.getValue();

        String __this__componentMetric_copy_key = other_element_key;

        MetricInfo __this__componentMetric_copy_value = new MetricInfo(other_element_value);

        __this__componentMetric.put(__this__componentMetric_copy_key, __this__componentMetric_copy_value);
      }
      this.componentMetric = __this__componentMetric;
    }
    if (other.is_set_workerMetric()) {
      Map<String,MetricInfo> __this__workerMetric = new HashMap<String,MetricInfo>(other.workerMetric.size());
      for (Map.Entry<String, MetricInfo> other_element : other.workerMetric.entrySet()) {

        String other_element_key = other_element.getKey();
        MetricInfo other_element_value = other_element.getValue();

        String __this__workerMetric_copy_key = other_element_key;

        MetricInfo __this__workerMetric_copy_value = new MetricInfo(other_element_value);

        __this__workerMetric.put(__this__workerMetric_copy_key, __this__workerMetric_copy_value);
      }
      this.workerMetric = __this__workerMetric;
    }
    if (other.is_set_taskMetric()) {
      Map<Integer,MetricInfo> __this__taskMetric = new HashMap<Integer,MetricInfo>(other.taskMetric.size());
      for (Map.Entry<Integer, MetricInfo> other_element : other.taskMetric.entrySet()) {

        Integer other_element_key = other_element.getKey();
        MetricInfo other_element_value = other_element.getValue();

        Integer __this__taskMetric_copy_key = other_element_key;

        MetricInfo __this__taskMetric_copy_value = new MetricInfo(other_element_value);

        __this__taskMetric.put(__this__taskMetric_copy_key, __this__taskMetric_copy_value);
      }
      this.taskMetric = __this__taskMetric;
    }
  }

  public TopologyMetric deepCopy() {
    return new TopologyMetric(this);
  }

  @Override
  public void clear() {
    this.topologyMetric = null;
    this.componentMetric = null;
    this.workerMetric = null;
    this.taskMetric = null;
  }

  public MetricInfo get_topologyMetric() {
    return this.topologyMetric;
  }

  public void set_topologyMetric(MetricInfo topologyMetric) {
    this.topologyMetric = topologyMetric;
  }

  public void unset_topologyMetric() {
    this.topologyMetric = null;
  }

  /** Returns true if field topologyMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_topologyMetric() {
    return this.topologyMetric != null;
  }

  public void set_topologyMetric_isSet(boolean value) {
    if (!value) {
      this.topologyMetric = null;
    }
  }

  public int get_componentMetric_size() {
    return (this.componentMetric == null) ? 0 : this.componentMetric.size();
  }

  public void put_to_componentMetric(String key, MetricInfo val) {
    if (this.componentMetric == null) {
      this.componentMetric = new HashMap<String,MetricInfo>();
    }
    this.componentMetric.put(key, val);
  }

  public Map<String,MetricInfo> get_componentMetric() {
    return this.componentMetric;
  }

  public void set_componentMetric(Map<String,MetricInfo> componentMetric) {
    this.componentMetric = componentMetric;
  }

  public void unset_componentMetric() {
    this.componentMetric = null;
  }

  /** Returns true if field componentMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_componentMetric() {
    return this.componentMetric != null;
  }

  public void set_componentMetric_isSet(boolean value) {
    if (!value) {
      this.componentMetric = null;
    }
  }

  public int get_workerMetric_size() {
    return (this.workerMetric == null) ? 0 : this.workerMetric.size();
  }

  public void put_to_workerMetric(String key, MetricInfo val) {
    if (this.workerMetric == null) {
      this.workerMetric = new HashMap<String,MetricInfo>();
    }
    this.workerMetric.put(key, val);
  }

  public Map<String,MetricInfo> get_workerMetric() {
    return this.workerMetric;
  }

  public void set_workerMetric(Map<String,MetricInfo> workerMetric) {
    this.workerMetric = workerMetric;
  }

  public void unset_workerMetric() {
    this.workerMetric = null;
  }

  /** Returns true if field workerMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_workerMetric() {
    return this.workerMetric != null;
  }

  public void set_workerMetric_isSet(boolean value) {
    if (!value) {
      this.workerMetric = null;
    }
  }

  public int get_taskMetric_size() {
    return (this.taskMetric == null) ? 0 : this.taskMetric.size();
  }

  public void put_to_taskMetric(int key, MetricInfo val) {
    if (this.taskMetric == null) {
      this.taskMetric = new HashMap<Integer,MetricInfo>();
    }
    this.taskMetric.put(key, val);
  }

  public Map<Integer,MetricInfo> get_taskMetric() {
    return this.taskMetric;
  }

  public void set_taskMetric(Map<Integer,MetricInfo> taskMetric) {
    this.taskMetric = taskMetric;
  }

  public void unset_taskMetric() {
    this.taskMetric = null;
  }

  /** Returns true if field taskMetric is set (has been assigned a value) and false otherwise */
  public boolean is_set_taskMetric() {
    return this.taskMetric != null;
  }

  public void set_taskMetric_isSet(boolean value) {
    if (!value) {
      this.taskMetric = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_METRIC:
      if (value == null) {
        unset_topologyMetric();
      } else {
        set_topologyMetric((MetricInfo)value);
      }
      break;

    case COMPONENT_METRIC:
      if (value == null) {
        unset_componentMetric();
      } else {
        set_componentMetric((Map<String,MetricInfo>)value);
      }
      break;

    case WORKER_METRIC:
      if (value == null) {
        unset_workerMetric();
      } else {
        set_workerMetric((Map<String,MetricInfo>)value);
      }
      break;

    case TASK_METRIC:
      if (value == null) {
        unset_taskMetric();
      } else {
        set_taskMetric((Map<Integer,MetricInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_METRIC:
      return get_topologyMetric();

    case COMPONENT_METRIC:
      return get_componentMetric();

    case WORKER_METRIC:
      return get_workerMetric();

    case TASK_METRIC:
      return get_taskMetric();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_METRIC:
      return is_set_topologyMetric();
    case COMPONENT_METRIC:
      return is_set_componentMetric();
    case WORKER_METRIC:
      return is_set_workerMetric();
    case TASK_METRIC:
      return is_set_taskMetric();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyMetric)
      return this.equals((TopologyMetric)that);
    return false;
  }

  public boolean equals(TopologyMetric that) {
    if (that == null)
      return false;

    boolean this_present_topologyMetric = true && this.is_set_topologyMetric();
    boolean that_present_topologyMetric = true && that.is_set_topologyMetric();
    if (this_present_topologyMetric || that_present_topologyMetric) {
      if (!(this_present_topologyMetric && that_present_topologyMetric))
        return false;
      if (!this.topologyMetric.equals(that.topologyMetric))
        return false;
    }

    boolean this_present_componentMetric = true && this.is_set_componentMetric();
    boolean that_present_componentMetric = true && that.is_set_componentMetric();
    if (this_present_componentMetric || that_present_componentMetric) {
      if (!(this_present_componentMetric && that_present_componentMetric))
        return false;
      if (!this.componentMetric.equals(that.componentMetric))
        return false;
    }

    boolean this_present_workerMetric = true && this.is_set_workerMetric();
    boolean that_present_workerMetric = true && that.is_set_workerMetric();
    if (this_present_workerMetric || that_present_workerMetric) {
      if (!(this_present_workerMetric && that_present_workerMetric))
        return false;
      if (!this.workerMetric.equals(that.workerMetric))
        return false;
    }

    boolean this_present_taskMetric = true && this.is_set_taskMetric();
    boolean that_present_taskMetric = true && that.is_set_taskMetric();
    if (this_present_taskMetric || that_present_taskMetric) {
      if (!(this_present_taskMetric && that_present_taskMetric))
        return false;
      if (!this.taskMetric.equals(that.taskMetric))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topologyMetric = true && (is_set_topologyMetric());
    list.add(present_topologyMetric);
    if (present_topologyMetric)
      list.add(topologyMetric);

    boolean present_componentMetric = true && (is_set_componentMetric());
    list.add(present_componentMetric);
    if (present_componentMetric)
      list.add(componentMetric);

    boolean present_workerMetric = true && (is_set_workerMetric());
    list.add(present_workerMetric);
    if (present_workerMetric)
      list.add(workerMetric);

    boolean present_taskMetric = true && (is_set_taskMetric());
    list.add(present_taskMetric);
    if (present_taskMetric)
      list.add(taskMetric);

    return list.hashCode();
  }

  @Override
  public int compareTo(TopologyMetric other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_topologyMetric()).compareTo(other.is_set_topologyMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topologyMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topologyMetric, other.topologyMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_componentMetric()).compareTo(other.is_set_componentMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_componentMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.componentMetric, other.componentMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_workerMetric()).compareTo(other.is_set_workerMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_workerMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workerMetric, other.workerMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_taskMetric()).compareTo(other.is_set_taskMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_taskMetric()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskMetric, other.taskMetric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologyMetric(");
    boolean first = true;

    sb.append("topologyMetric:");
    if (this.topologyMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.topologyMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("componentMetric:");
    if (this.componentMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.componentMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("workerMetric:");
    if (this.workerMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.workerMetric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskMetric:");
    if (this.taskMetric == null) {
      sb.append("null");
    } else {
      sb.append(this.taskMetric);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_topologyMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topologyMetric' is unset! Struct:" + toString());
    }

    if (!is_set_componentMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'componentMetric' is unset! Struct:" + toString());
    }

    if (!is_set_workerMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'workerMetric' is unset! Struct:" + toString());
    }

    if (!is_set_taskMetric()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskMetric' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (topologyMetric != null) {
      topologyMetric.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopologyMetricStandardSchemeFactory implements SchemeFactory {
    public TopologyMetricStandardScheme getScheme() {
      return new TopologyMetricStandardScheme();
    }
  }

  private static class TopologyMetricStandardScheme extends StandardScheme<TopologyMetric> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TopologyMetric struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.topologyMetric = new MetricInfo();
              struct.topologyMetric.read(iprot);
              struct.set_topologyMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPONENT_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map166 = iprot.readMapBegin();
                struct.componentMetric = new HashMap<String,MetricInfo>(2*_map166.size);
                String _key167;
                MetricInfo _val168;
                for (int _i169 = 0; _i169 < _map166.size; ++_i169)
                {
                  _key167 = iprot.readString();
                  _val168 = new MetricInfo();
                  _val168.read(iprot);
                  struct.componentMetric.put(_key167, _val168);
                }
                iprot.readMapEnd();
              }
              struct.set_componentMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WORKER_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map170 = iprot.readMapBegin();
                struct.workerMetric = new HashMap<String,MetricInfo>(2*_map170.size);
                String _key171;
                MetricInfo _val172;
                for (int _i173 = 0; _i173 < _map170.size; ++_i173)
                {
                  _key171 = iprot.readString();
                  _val172 = new MetricInfo();
                  _val172.read(iprot);
                  struct.workerMetric.put(_key171, _val172);
                }
                iprot.readMapEnd();
              }
              struct.set_workerMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TASK_METRIC
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map174 = iprot.readMapBegin();
                struct.taskMetric = new HashMap<Integer,MetricInfo>(2*_map174.size);
                int _key175;
                MetricInfo _val176;
                for (int _i177 = 0; _i177 < _map174.size; ++_i177)
                {
                  _key175 = iprot.readI32();
                  _val176 = new MetricInfo();
                  _val176.read(iprot);
                  struct.taskMetric.put(_key175, _val176);
                }
                iprot.readMapEnd();
              }
              struct.set_taskMetric_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TopologyMetric struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topologyMetric != null) {
        oprot.writeFieldBegin(TOPOLOGY_METRIC_FIELD_DESC);
        struct.topologyMetric.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.componentMetric != null) {
        oprot.writeFieldBegin(COMPONENT_METRIC_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.componentMetric.size()));
          for (Map.Entry<String, MetricInfo> _iter178 : struct.componentMetric.entrySet())
          {
            oprot.writeString(_iter178.getKey());
            _iter178.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.workerMetric != null) {
        oprot.writeFieldBegin(WORKER_METRIC_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.workerMetric.size()));
          for (Map.Entry<String, MetricInfo> _iter179 : struct.workerMetric.entrySet())
          {
            oprot.writeString(_iter179.getKey());
            _iter179.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.taskMetric != null) {
        oprot.writeFieldBegin(TASK_METRIC_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.taskMetric.size()));
          for (Map.Entry<Integer, MetricInfo> _iter180 : struct.taskMetric.entrySet())
          {
            oprot.writeI32(_iter180.getKey());
            _iter180.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopologyMetricTupleSchemeFactory implements SchemeFactory {
    public TopologyMetricTupleScheme getScheme() {
      return new TopologyMetricTupleScheme();
    }
  }

  private static class TopologyMetricTupleScheme extends TupleScheme<TopologyMetric> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TopologyMetric struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topologyMetric.write(oprot);
      {
        oprot.writeI32(struct.componentMetric.size());
        for (Map.Entry<String, MetricInfo> _iter181 : struct.componentMetric.entrySet())
        {
          oprot.writeString(_iter181.getKey());
          _iter181.getValue().write(oprot);
        }
      }
      {
        oprot.writeI32(struct.workerMetric.size());
        for (Map.Entry<String, MetricInfo> _iter182 : struct.workerMetric.entrySet())
        {
          oprot.writeString(_iter182.getKey());
          _iter182.getValue().write(oprot);
        }
      }
      {
        oprot.writeI32(struct.taskMetric.size());
        for (Map.Entry<Integer, MetricInfo> _iter183 : struct.taskMetric.entrySet())
        {
          oprot.writeI32(_iter183.getKey());
          _iter183.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TopologyMetric struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topologyMetric = new MetricInfo();
      struct.topologyMetric.read(iprot);
      struct.set_topologyMetric_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map184 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.componentMetric = new HashMap<String,MetricInfo>(2*_map184.size);
        String _key185;
        MetricInfo _val186;
        for (int _i187 = 0; _i187 < _map184.size; ++_i187)
        {
          _key185 = iprot.readString();
          _val186 = new MetricInfo();
          _val186.read(iprot);
          struct.componentMetric.put(_key185, _val186);
        }
      }
      struct.set_componentMetric_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map188 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.workerMetric = new HashMap<String,MetricInfo>(2*_map188.size);
        String _key189;
        MetricInfo _val190;
        for (int _i191 = 0; _i191 < _map188.size; ++_i191)
        {
          _key189 = iprot.readString();
          _val190 = new MetricInfo();
          _val190.read(iprot);
          struct.workerMetric.put(_key189, _val190);
        }
      }
      struct.set_workerMetric_isSet(true);
      {
        org.apache.thrift.protocol.TMap _map192 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.taskMetric = new HashMap<Integer,MetricInfo>(2*_map192.size);
        int _key193;
        MetricInfo _val194;
        for (int _i195 = 0; _i195 < _map192.size; ++_i195)
        {
          _key193 = iprot.readI32();
          _val194 = new MetricInfo();
          _val194.read(iprot);
          struct.taskMetric.put(_key193, _val194);
        }
      }
      struct.set_taskMetric_isSet(true);
    }
  }

}

