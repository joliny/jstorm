/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComponentCommon implements
		org.apache.thrift.TBase<ComponentCommon, ComponentCommon._Fields>,
		java.io.Serializable, Cloneable {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"ComponentCommon");

	private static final org.apache.thrift.protocol.TField INPUTS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"inputs", org.apache.thrift.protocol.TType.MAP, (short) 1);
	private static final org.apache.thrift.protocol.TField STREAMS_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"streams", org.apache.thrift.protocol.TType.MAP, (short) 2);
	private static final org.apache.thrift.protocol.TField PARALLELISM_HINT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"parallelism_hint", org.apache.thrift.protocol.TType.I32, (short) 3);
	private static final org.apache.thrift.protocol.TField JSON_CONF_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"json_conf", org.apache.thrift.protocol.TType.STRING, (short) 4);

	private Map<GlobalStreamId, Grouping> inputs; // required
	private Map<String, StreamInfo> streams; // required
	private int parallelism_hint; // required
	private String json_conf; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		INPUTS((short) 1, "inputs"), STREAMS((short) 2, "streams"), PARALLELISM_HINT(
				(short) 3, "parallelism_hint"), JSON_CONF((short) 4,
				"json_conf");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // INPUTS
				return INPUTS;
			case 2: // STREAMS
				return STREAMS;
			case 3: // PARALLELISM_HINT
				return PARALLELISM_HINT;
			case 4: // JSON_CONF
				return JSON_CONF;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId
						+ " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
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
	private static final int __PARALLELISM_HINT_ISSET_ID = 0;
	private BitSet __isset_bit_vector = new BitSet(1);

	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(
				_Fields.INPUTS,
				new org.apache.thrift.meta_data.FieldMetaData(
						"inputs",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.MapMetaData(
								org.apache.thrift.protocol.TType.MAP,
								new org.apache.thrift.meta_data.StructMetaData(
										org.apache.thrift.protocol.TType.STRUCT,
										GlobalStreamId.class),
								new org.apache.thrift.meta_data.StructMetaData(
										org.apache.thrift.protocol.TType.STRUCT,
										Grouping.class))));
		tmpMap.put(
				_Fields.STREAMS,
				new org.apache.thrift.meta_data.FieldMetaData(
						"streams",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.MapMetaData(
								org.apache.thrift.protocol.TType.MAP,
								new org.apache.thrift.meta_data.FieldValueMetaData(
										org.apache.thrift.protocol.TType.STRING),
								new org.apache.thrift.meta_data.StructMetaData(
										org.apache.thrift.protocol.TType.STRUCT,
										StreamInfo.class))));
		tmpMap.put(_Fields.PARALLELISM_HINT,
				new org.apache.thrift.meta_data.FieldMetaData(
						"parallelism_hint",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.I32)));
		tmpMap.put(_Fields.JSON_CONF,
				new org.apache.thrift.meta_data.FieldMetaData("json_conf",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
				ComponentCommon.class, metaDataMap);
	}

	public ComponentCommon() {
	}

	public ComponentCommon(Map<GlobalStreamId, Grouping> inputs,
			Map<String, StreamInfo> streams) {
		this();
		this.inputs = inputs;
		this.streams = streams;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public ComponentCommon(ComponentCommon other) {
		__isset_bit_vector.clear();
		__isset_bit_vector.or(other.__isset_bit_vector);
		if (other.is_set_inputs()) {
			Map<GlobalStreamId, Grouping> __this__inputs = new HashMap<GlobalStreamId, Grouping>();
			for (Map.Entry<GlobalStreamId, Grouping> other_element : other.inputs
					.entrySet()) {

				GlobalStreamId other_element_key = other_element.getKey();
				Grouping other_element_value = other_element.getValue();

				GlobalStreamId __this__inputs_copy_key = new GlobalStreamId(
						other_element_key);

				Grouping __this__inputs_copy_value = new Grouping(
						other_element_value);

				__this__inputs.put(__this__inputs_copy_key,
						__this__inputs_copy_value);
			}
			this.inputs = __this__inputs;
		}
		if (other.is_set_streams()) {
			Map<String, StreamInfo> __this__streams = new HashMap<String, StreamInfo>();
			for (Map.Entry<String, StreamInfo> other_element : other.streams
					.entrySet()) {

				String other_element_key = other_element.getKey();
				StreamInfo other_element_value = other_element.getValue();

				String __this__streams_copy_key = other_element_key;

				StreamInfo __this__streams_copy_value = new StreamInfo(
						other_element_value);

				__this__streams.put(__this__streams_copy_key,
						__this__streams_copy_value);
			}
			this.streams = __this__streams;
		}
		this.parallelism_hint = other.parallelism_hint;
		if (other.is_set_json_conf()) {
			this.json_conf = other.json_conf;
		}
	}

	public ComponentCommon deepCopy() {
		return new ComponentCommon(this);
	}

	@Override
	public void clear() {
		this.inputs = null;
		this.streams = null;
		set_parallelism_hint_isSet(false);
		this.parallelism_hint = 0;
		this.json_conf = null;
	}

	public int get_inputs_size() {
		return (this.inputs == null) ? 0 : this.inputs.size();
	}

	public void put_to_inputs(GlobalStreamId key, Grouping val) {
		if (this.inputs == null) {
			this.inputs = new HashMap<GlobalStreamId, Grouping>();
		}
		this.inputs.put(key, val);
	}

	public Map<GlobalStreamId, Grouping> get_inputs() {
		return this.inputs;
	}

	public void set_inputs(Map<GlobalStreamId, Grouping> inputs) {
		this.inputs = inputs;
	}

	public void unset_inputs() {
		this.inputs = null;
	}

	/**
	 * Returns true if field inputs is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean is_set_inputs() {
		return this.inputs != null;
	}

	public void set_inputs_isSet(boolean value) {
		if (!value) {
			this.inputs = null;
		}
	}

	public int get_streams_size() {
		return (this.streams == null) ? 0 : this.streams.size();
	}

	public void put_to_streams(String key, StreamInfo val) {
		if (this.streams == null) {
			this.streams = new HashMap<String, StreamInfo>();
		}
		this.streams.put(key, val);
	}

	public Map<String, StreamInfo> get_streams() {
		return this.streams;
	}

	public void set_streams(Map<String, StreamInfo> streams) {
		this.streams = streams;
	}

	public void unset_streams() {
		this.streams = null;
	}

	/**
	 * Returns true if field streams is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean is_set_streams() {
		return this.streams != null;
	}

	public void set_streams_isSet(boolean value) {
		if (!value) {
			this.streams = null;
		}
	}

	public int get_parallelism_hint() {
		return this.parallelism_hint;
	}

	public void set_parallelism_hint(int parallelism_hint) {
		this.parallelism_hint = parallelism_hint;
		set_parallelism_hint_isSet(true);
	}

	public void unset_parallelism_hint() {
		__isset_bit_vector.clear(__PARALLELISM_HINT_ISSET_ID);
	}

	/**
	 * Returns true if field parallelism_hint is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean is_set_parallelism_hint() {
		return __isset_bit_vector.get(__PARALLELISM_HINT_ISSET_ID);
	}

	public void set_parallelism_hint_isSet(boolean value) {
		__isset_bit_vector.set(__PARALLELISM_HINT_ISSET_ID, value);
	}

	public String get_json_conf() {
		return this.json_conf;
	}

	public void set_json_conf(String json_conf) {
		this.json_conf = json_conf;
	}

	public void unset_json_conf() {
		this.json_conf = null;
	}

	/**
	 * Returns true if field json_conf is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean is_set_json_conf() {
		return this.json_conf != null;
	}

	public void set_json_conf_isSet(boolean value) {
		if (!value) {
			this.json_conf = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case INPUTS:
			if (value == null) {
				unset_inputs();
			} else {
				set_inputs((Map<GlobalStreamId, Grouping>) value);
			}
			break;

		case STREAMS:
			if (value == null) {
				unset_streams();
			} else {
				set_streams((Map<String, StreamInfo>) value);
			}
			break;

		case PARALLELISM_HINT:
			if (value == null) {
				unset_parallelism_hint();
			} else {
				set_parallelism_hint((Integer) value);
			}
			break;

		case JSON_CONF:
			if (value == null) {
				unset_json_conf();
			} else {
				set_json_conf((String) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case INPUTS:
			return get_inputs();

		case STREAMS:
			return get_streams();

		case PARALLELISM_HINT:
			return Integer.valueOf(get_parallelism_hint());

		case JSON_CONF:
			return get_json_conf();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case INPUTS:
			return is_set_inputs();
		case STREAMS:
			return is_set_streams();
		case PARALLELISM_HINT:
			return is_set_parallelism_hint();
		case JSON_CONF:
			return is_set_json_conf();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof ComponentCommon)
			return this.equals((ComponentCommon) that);
		return false;
	}

	public boolean equals(ComponentCommon that) {
		if (that == null)
			return false;

		boolean this_present_inputs = true && this.is_set_inputs();
		boolean that_present_inputs = true && that.is_set_inputs();
		if (this_present_inputs || that_present_inputs) {
			if (!(this_present_inputs && that_present_inputs))
				return false;
			if (!this.inputs.equals(that.inputs))
				return false;
		}

		boolean this_present_streams = true && this.is_set_streams();
		boolean that_present_streams = true && that.is_set_streams();
		if (this_present_streams || that_present_streams) {
			if (!(this_present_streams && that_present_streams))
				return false;
			if (!this.streams.equals(that.streams))
				return false;
		}

		boolean this_present_parallelism_hint = true && this
				.is_set_parallelism_hint();
		boolean that_present_parallelism_hint = true && that
				.is_set_parallelism_hint();
		if (this_present_parallelism_hint || that_present_parallelism_hint) {
			if (!(this_present_parallelism_hint && that_present_parallelism_hint))
				return false;
			if (this.parallelism_hint != that.parallelism_hint)
				return false;
		}

		boolean this_present_json_conf = true && this.is_set_json_conf();
		boolean that_present_json_conf = true && that.is_set_json_conf();
		if (this_present_json_conf || that_present_json_conf) {
			if (!(this_present_json_conf && that_present_json_conf))
				return false;
			if (!this.json_conf.equals(that.json_conf))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();

		boolean present_inputs = true && (is_set_inputs());
		builder.append(present_inputs);
		if (present_inputs)
			builder.append(inputs);

		boolean present_streams = true && (is_set_streams());
		builder.append(present_streams);
		if (present_streams)
			builder.append(streams);

		boolean present_parallelism_hint = true && (is_set_parallelism_hint());
		builder.append(present_parallelism_hint);
		if (present_parallelism_hint)
			builder.append(parallelism_hint);

		boolean present_json_conf = true && (is_set_json_conf());
		builder.append(present_json_conf);
		if (present_json_conf)
			builder.append(json_conf);

		return builder.toHashCode();
	}

	public int compareTo(ComponentCommon other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;
		ComponentCommon typedOther = (ComponentCommon) other;

		lastComparison = Boolean.valueOf(is_set_inputs()).compareTo(
				typedOther.is_set_inputs());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_inputs()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.inputs, typedOther.inputs);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(is_set_streams()).compareTo(
				typedOther.is_set_streams());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_streams()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.streams, typedOther.streams);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(is_set_parallelism_hint()).compareTo(
				typedOther.is_set_parallelism_hint());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_parallelism_hint()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.parallelism_hint, typedOther.parallelism_hint);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(is_set_json_conf()).compareTo(
				typedOther.is_set_json_conf());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_json_conf()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.json_conf, typedOther.json_conf);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot)
			throws org.apache.thrift.TException {
		org.apache.thrift.protocol.TField field;
		iprot.readStructBegin();
		while (true) {
			field = iprot.readFieldBegin();
			if (field.type == org.apache.thrift.protocol.TType.STOP) {
				break;
			}
			switch (field.id) {
			case 1: // INPUTS
				if (field.type == org.apache.thrift.protocol.TType.MAP) {
					{
						org.apache.thrift.protocol.TMap _map12 = iprot
								.readMapBegin();
						this.inputs = new HashMap<GlobalStreamId, Grouping>(
								2 * _map12.size);
						for (int _i13 = 0; _i13 < _map12.size; ++_i13) {
							GlobalStreamId _key14; // required
							Grouping _val15; // required
							_key14 = new GlobalStreamId();
							_key14.read(iprot);
							_val15 = new Grouping();
							_val15.read(iprot);
							this.inputs.put(_key14, _val15);
						}
						iprot.readMapEnd();
					}
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			case 2: // STREAMS
				if (field.type == org.apache.thrift.protocol.TType.MAP) {
					{
						org.apache.thrift.protocol.TMap _map16 = iprot
								.readMapBegin();
						this.streams = new HashMap<String, StreamInfo>(
								2 * _map16.size);
						for (int _i17 = 0; _i17 < _map16.size; ++_i17) {
							String _key18; // required
							StreamInfo _val19; // required
							_key18 = iprot.readString();
							_val19 = new StreamInfo();
							_val19.read(iprot);
							this.streams.put(_key18, _val19);
						}
						iprot.readMapEnd();
					}
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			case 3: // PARALLELISM_HINT
				if (field.type == org.apache.thrift.protocol.TType.I32) {
					this.parallelism_hint = iprot.readI32();
					set_parallelism_hint_isSet(true);
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			case 4: // JSON_CONF
				if (field.type == org.apache.thrift.protocol.TType.STRING) {
					this.json_conf = iprot.readString();
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			default:
				org.apache.thrift.protocol.TProtocolUtil
						.skip(iprot, field.type);
			}
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();
		validate();
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.inputs != null) {
			oprot.writeFieldBegin(INPUTS_FIELD_DESC);
			{
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(
						org.apache.thrift.protocol.TType.STRUCT,
						org.apache.thrift.protocol.TType.STRUCT, this.inputs
								.size()));
				for (Map.Entry<GlobalStreamId, Grouping> _iter20 : this.inputs
						.entrySet()) {
					_iter20.getKey().write(oprot);
					_iter20.getValue().write(oprot);
				}
				oprot.writeMapEnd();
			}
			oprot.writeFieldEnd();
		}
		if (this.streams != null) {
			oprot.writeFieldBegin(STREAMS_FIELD_DESC);
			{
				oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(
						org.apache.thrift.protocol.TType.STRING,
						org.apache.thrift.protocol.TType.STRUCT, this.streams
								.size()));
				for (Map.Entry<String, StreamInfo> _iter21 : this.streams
						.entrySet()) {
					oprot.writeString(_iter21.getKey());
					_iter21.getValue().write(oprot);
				}
				oprot.writeMapEnd();
			}
			oprot.writeFieldEnd();
		}
		if (is_set_parallelism_hint()) {
			oprot.writeFieldBegin(PARALLELISM_HINT_FIELD_DESC);
			oprot.writeI32(this.parallelism_hint);
			oprot.writeFieldEnd();
		}
		if (this.json_conf != null) {
			if (is_set_json_conf()) {
				oprot.writeFieldBegin(JSON_CONF_FIELD_DESC);
				oprot.writeString(this.json_conf);
				oprot.writeFieldEnd();
			}
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ComponentCommon(");
		boolean first = true;

		sb.append("inputs:");
		if (this.inputs == null) {
			sb.append("null");
		} else {
			sb.append(this.inputs);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("streams:");
		if (this.streams == null) {
			sb.append("null");
		} else {
			sb.append(this.streams);
		}
		first = false;
		if (is_set_parallelism_hint()) {
			if (!first)
				sb.append(", ");
			sb.append("parallelism_hint:");
			sb.append(this.parallelism_hint);
			first = false;
		}
		if (is_set_json_conf()) {
			if (!first)
				sb.append(", ");
			sb.append("json_conf:");
			if (this.json_conf == null) {
				sb.append("null");
			} else {
				sb.append(this.json_conf);
			}
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		if (!is_set_inputs()) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'inputs' is unset! Struct:" + toString());
		}

		if (!is_set_streams()) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'streams' is unset! Struct:" + toString());
		}

	}

	private void writeObject(java.io.ObjectOutputStream out)
			throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in)
			throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java
			// serialization is wacky, and doesn't call the default constructor.
			__isset_bit_vector = new BitSet(1);
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

}
