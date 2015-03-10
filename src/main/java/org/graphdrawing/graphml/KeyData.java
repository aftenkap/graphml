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
 * Complex type for the {@code <data>} element. data.type is mixed, that is,
 * {@code <data>} may contain #PCDATA. Content type: extension of
 * data-extension.type which is empty per default.
 * 
 * 
 * <p>
 * Java class for data.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="data.type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://graphml.graphdrawing.org/xmlns}data-extension.type"&gt;
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}data.extra.attrib"/&gt;
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}long" default="0" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data.type")
public class KeyData
        extends KeyDataExtension {

    @XmlAttribute(name = "key", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String key;
    @XmlAttribute(name = "time")
    private Long   time;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String id;

    /**
     * Gets the value of the key property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getKey() {

        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setKey(String value) {

        this.key = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link Long }
     * 
     */
    public long getTime() {

        if (time == null) {
            return 0L;
        }
        else {
            return time;
        }
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *            allowed object is {@link Long }
     * 
     */
    public void setTime(Long value) {

        this.time = value;
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

}
