/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.organization.management.endpoint.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.organization.management.endpoint.model.BasicOrganizationResponse;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class SharedOrganizationsResponse  {
  
    private List<BasicOrganizationResponse> organizations = null;


    /**
    **/
    public SharedOrganizationsResponse organizations(List<BasicOrganizationResponse> organizations) {

        this.organizations = organizations;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("organizations")
    @Valid
    public List<BasicOrganizationResponse> getOrganizations() {
        return organizations;
    }
    public void setOrganizations(List<BasicOrganizationResponse> organizations) {
        this.organizations = organizations;
    }

    public SharedOrganizationsResponse addOrganizationsItem(BasicOrganizationResponse organizationsItem) {
        if (this.organizations == null) {
            this.organizations = new ArrayList<>();
        }
        this.organizations.add(organizationsItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharedOrganizationsResponse sharedOrganizationsResponse = (SharedOrganizationsResponse) o;
        return Objects.equals(this.organizations, sharedOrganizationsResponse.organizations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizations);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class SharedOrganizationsResponse {\n");
        
        sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

