package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
* GraphML library
* %%
* Copyright (C) 2011 - 2014 jutility.org
* %%
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*      http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* #L%
*/
//@formatter:on



import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for key.type.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="key.type.type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="int"/&gt;
 *     &lt;enumeration value="long"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlType(name = "key.type.type")
@XmlEnum
public enum KeyType {

    /**
     * Boolean.
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    /**
     * Integer.
     */
    @XmlEnumValue("int")
    INT("int"),
    /**
     * Long.
     */
    @XmlEnumValue("long")
    LONG("long"),
    /**
     * Float.
     */
    @XmlEnumValue("float")
    FLOAT("float"),
    /**
     * Double.
     */
    @XmlEnumValue("double")
    DOUBLE("double"),
    /**
     * String.
     */
    @XmlEnumValue("string")
    STRING("string");

    private final String value;

    /**
     * Creates a new instance of the {@link KeyType} class with the provided
     * value.
     * 
     * @param value
     *            the value.
     */
    private KeyType(String value) {

        this.value = value;
    }

    /**
     * Returns the value.
     * 
     * @return the value.
     */
    public String value() {

        return value;
    }

    /**
     * Returns the {@link KeyType} corresponding to the provided value.
     * 
     * @param value
     *            the value.
     * @return the {@link KeyType} corresponding to the provided value.
     */
    public static KeyType fromValue(String value) {

        for (KeyType constant : KeyType.values()) {

            if (constant.value.equals(value)) {

                return constant;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
