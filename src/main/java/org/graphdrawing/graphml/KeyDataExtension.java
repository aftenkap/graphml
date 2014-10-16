package org.graphdrawing.graphml;

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



import javax.xml.bind.annotation.*;


/**
 * 
 * Extension mechanism for the content of {@code <data>} and {@code <default>}.
 * The complex type data-extension.type is empty per default. Users may redefine
 * this type in order to add content to the complex types data.type and
 * default.type which are extensions of data-extension.type.
 * 
 * 
 * <p>
 * Java class for data-extension.type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="data-extension.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.0.1
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data-extension.type", propOrder = { "content" })
@XmlSeeAlso({ DefaultKeyValue.class, KeyData.class })
public class KeyDataExtension {

    @XmlValue
    private String content;

    /**
     * 
     * Extension mechanism for the content of <data> and <default>. The complex
     * type data-extension.type is empty per default. Users may redefine this
     * type in order to add content to the complex types data.type and
     * default.type which are extensions of data-extension.type.
     * 
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getContent() {

        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContent(String value) {

        this.content = value;
    }

}
