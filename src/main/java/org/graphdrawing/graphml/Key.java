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



import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * Complex type for the {@code <key>} element.
 * 
 * 
 * <p>
 * Java class for key.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="key.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}default" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}key.extra.attrib"/&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="for" type="{http://graphml.graphdrawing.org/xmlns}key.for.type" default="all" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key.type", propOrder = { "description", "defaultValue" })
public class Key {

    @XmlElement(name = "desc")
    private String          description;

    @XmlElement(name = "default")
    private DefaultKeyValue defaultValue;

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String          id;

    @XmlAttribute(name = "dynamic")
    private Boolean         dynamic;

    @XmlAttribute(name = "for")
    private KeyForType      keyForType;

    @XmlAttribute(name = "attr.name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    private String          attributeName;

    @XmlAttribute(name = "attr.type")
    private KeyType         attributeType;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {

        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {

        this.description = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return possible object is {@link DefaultKeyValue }
     * 
     */
    public DefaultKeyValue getDefault() {

        return defaultValue;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *            allowed object is {@link DefaultKeyValue }
     * 
     */
    public void setDefault(DefaultKeyValue value) {

        this.defaultValue = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {

        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {

        this.id = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isDynamic() {

        if (dynamic == null) {
            return false;
        }
        else {
            return dynamic;
        }
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setDynamic(Boolean value) {

        this.dynamic = value;
    }

    /**
     * Gets the value of the for property.
     * 
     * @return possible object is {@link KeyForType }
     * 
     */
    public KeyForType getKeyForType() {

        if (keyForType == null) {
            return KeyForType.ALL;
        }
        else {
            return keyForType;
        }
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *            allowed object is {@link KeyForType }
     * 
     */
    public void setKeyForType(KeyForType value) {

        this.keyForType = value;
    }

    /**
     * Gets the value of the attributeName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAttributeName() {

        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAttributeName(String value) {

        this.attributeName = value;
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return possible object is {@link KeyType }
     * 
     */
    public KeyType getAttributeType() {

        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *            allowed object is {@link KeyType }
     * 
     */
    public void setAttributeType(KeyType value) {

        this.attributeType = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == Key.class) {
            Key otherKey = (Key) obj;

            if ((this.getAttributeName() != null
                    && otherKey.getAttributeName() != null && this
                    .getAttributeName().equals(otherKey.getAttributeName()))
                    || (this.getAttributeName() == null && otherKey
                            .getAttributeName() == null)) {
                if ((this.getAttributeType() != null
                        && otherKey.getAttributeType() != null && this
                        .getAttributeType().equals(otherKey.getAttributeType()))
                        || (this.getAttributeType() == null && otherKey
                                .getAttributeType() == null)) {
                    if ((this.getDefault() != null
                            && otherKey.getDefault() != null && this
                            .getDefault().equals(otherKey.getDefault()))
                            || (this.getDefault() == null && otherKey
                                    .getDefault() == null)) {
                        if ((this.getId() != null && otherKey.getId() != null && this
                                .getId().equals(otherKey.getId()))
                                || (this.getId() == null && otherKey.getId() == null)) {
                            if ((this.getDefault() != null
                                    && otherKey.getDefault() != null && this
                                    .getDefault().equals(otherKey.getDefault()))
                                    || (this.getDefault() == null && otherKey
                                            .getDefault() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;

    }

    @Override
    public int hashCode() {

        int hashCode = 71;
        if (this.attributeName != null) {
            hashCode += this.attributeName.hashCode();
        }
        if (this.attributeType != null) {
            hashCode += this.attributeType.hashCode();
        }
        if (this.description != null) {
            hashCode += this.description.charAt(hashCode);
        }
        if (this.defaultValue != null) {
            hashCode += this.defaultValue.hashCode();
        }
        if (this.id != null) {
            hashCode += this.id.hashCode();
        }
        if (this.keyForType != null) {
            hashCode += this.keyForType.hashCode();
        }
        return hashCode;
    }



}
