/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.tapad;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Example extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Example\",\"namespace\":\"com.tapad\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"my_enum\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ExampleEnum\",\"symbols\":[\"FOO\",\"BAR\",\"BAZ\"]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long id;
  @Deprecated public com.tapad.ExampleEnum my_enum;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Example() {}

  /**
   * All-args constructor.
   */
  public Example(java.lang.Long id, com.tapad.ExampleEnum my_enum) {
    this.id = id;
    this.my_enum = my_enum;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return my_enum;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: my_enum = (com.tapad.ExampleEnum)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'my_enum' field.
   */
  public com.tapad.ExampleEnum getMyEnum() {
    return my_enum;
  }

  /**
   * Sets the value of the 'my_enum' field.
   * @param value the value to set.
   */
  public void setMyEnum(com.tapad.ExampleEnum value) {
    this.my_enum = value;
  }

  /** Creates a new Example RecordBuilder */
  public static com.tapad.Example.Builder newBuilder() {
    return new com.tapad.Example.Builder();
  }
  
  /** Creates a new Example RecordBuilder by copying an existing Builder */
  public static com.tapad.Example.Builder newBuilder(com.tapad.Example.Builder other) {
    return new com.tapad.Example.Builder(other);
  }
  
  /** Creates a new Example RecordBuilder by copying an existing Example instance */
  public static com.tapad.Example.Builder newBuilder(com.tapad.Example other) {
    return new com.tapad.Example.Builder(other);
  }
  
  /**
   * RecordBuilder for Example instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Example>
    implements org.apache.avro.data.RecordBuilder<Example> {

    private long id;
    private com.tapad.ExampleEnum my_enum;

    /** Creates a new Builder */
    private Builder() {
      super(com.tapad.Example.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.tapad.Example.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.my_enum)) {
        this.my_enum = data().deepCopy(fields()[1].schema(), other.my_enum);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Example instance */
    private Builder(com.tapad.Example other) {
            super(com.tapad.Example.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.my_enum)) {
        this.my_enum = data().deepCopy(fields()[1].schema(), other.my_enum);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.tapad.Example.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.tapad.Example.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'my_enum' field */
    public com.tapad.ExampleEnum getMyEnum() {
      return my_enum;
    }
    
    /** Sets the value of the 'my_enum' field */
    public com.tapad.Example.Builder setMyEnum(com.tapad.ExampleEnum value) {
      validate(fields()[1], value);
      this.my_enum = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'my_enum' field has been set */
    public boolean hasMyEnum() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'my_enum' field */
    public com.tapad.Example.Builder clearMyEnum() {
      my_enum = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Example build() {
      try {
        Example record = new Example();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.my_enum = fieldSetFlags()[1] ? this.my_enum : (com.tapad.ExampleEnum) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
