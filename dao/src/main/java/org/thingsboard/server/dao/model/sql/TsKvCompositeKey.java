/**
 * Copyright © 2016-2017 PT VIO Intelligence Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.model.sql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thingsboard.server.common.data.EntityType;

import javax.persistence.Transient;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TsKvCompositeKey implements Serializable {

    @Transient
    private static final long serialVersionUID = -4089175869616037523L;

    private EntityType entityType;
    private String entityId;
    private String key;
    private long ts;
}