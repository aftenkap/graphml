package org.graphdrawing.graphml;

//@formatter:off
/*
* #%L
 * * GraphML library
 * *
 * %%
 * Copyright (C) 2011 - 2014 jutility.org
 * *
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


import java.util.List;


/**
 * The {@link IKeyDataContainer} interface defines a contract for objects
 * containing {@link KeyData}.
 * 
 * @author Peter J. Radics
 * @version 1.0.0
 * @since 0.1.0
 */
public interface IKeyDataContainer {

    /**
     * Returns a {@link List} of {@link KeyData}.
     * 
     * @return a {@link List} of {@link KeyData}.
     */
    public List<KeyData> getKeyData();
}
