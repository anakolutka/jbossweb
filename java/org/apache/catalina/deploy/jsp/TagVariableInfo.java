/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

 
package org.apache.catalina.deploy.jsp;

public class TagVariableInfo {
    /*
     * private fields
     */
    protected String   nameGiven;         // <name-given>
    protected String   nameFromAttribute; // <name-from-attribute>
    protected String   className;         // <class>
    protected boolean  declare;           // <declare>
    protected int      scope;             // <scope>

    public String getNameGiven() {
        return nameGiven;
    }
    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }
    public String getNameFromAttribute() {
        return nameFromAttribute;
    }
    public void setNameFromAttribute(String nameFromAttribute) {
        this.nameFromAttribute = nameFromAttribute;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public boolean isDeclare() {
        return declare;
    }
    public void setDeclare(boolean declare) {
        this.declare = declare;
    }
    public int getScope() {
        return scope;
    }
    public void setScope(int scope) {
        this.scope = scope;
    }
    
}
