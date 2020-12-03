/**
 * Copyright 2019 The JoyQueue Authors.
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
package org.joyqueue.broker.protocol.coordinator.assignment.domain;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * TopicPartitionGroupAssignmentMetadata
 *
 * author: gaohaoxiang
 * date: 2018/12/5
 */
public class TopicPartitionGroupAssignmentMetadata {

    private String topic;
    private Map<Integer, PartitionGroupAssignmentMetadata> partitionGroups = Maps.newHashMap();

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setPartitionGroups(Map<Integer, PartitionGroupAssignmentMetadata> partitionGroups) {
        this.partitionGroups = partitionGroups;
    }

    public Map<Integer, PartitionGroupAssignmentMetadata> getPartitionGroups() {
        return partitionGroups;
    }
}