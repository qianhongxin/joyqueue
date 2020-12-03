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
package org.joyqueue.toolkit.validate;

import java.lang.annotation.Annotation;

/**
 * Created by hexiaofeng on 16-5-10.
 */
public interface Validator {

    /**
     * 认证
     *
     * @param target     目标对象
     * @param annotation 验证声明
     * @param value      字段值
     * @throws ValidateException
     */
    void validate(Object target, Annotation annotation, Value value) throws ValidateException;

    class Value {
        // 名称
        public String name;
        // 值类型
        public Class<?> type;
        // 值
        public Object value;

        public Value(final String name, final Class<?> type, final Object value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

    }
}
