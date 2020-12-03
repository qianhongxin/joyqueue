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
package org.joyqueue.broker.protocol.handler;

import org.joyqueue.broker.protocol.JoyQueueCommandHandler;
import org.joyqueue.network.command.FetchHealthResponse;
import org.joyqueue.network.command.JoyQueueCommandType;
import org.joyqueue.network.transport.Transport;
import org.joyqueue.network.transport.command.Command;
import org.joyqueue.network.transport.command.Type;

/**
 * FetchHealthRequestHandler
 *
 * author: gaohaoxiang
 * date: 2018/12/28
 */
public class FetchHealthRequestHandler implements JoyQueueCommandHandler, Type {

    @Override
    public Command handle(Transport transport, Command command) {
        FetchHealthResponse fetchHealthResponse = new FetchHealthResponse(0);
        return new Command(fetchHealthResponse);
    }

    @Override
    public int type() {
        return JoyQueueCommandType.FETCH_HEALTH_REQUEST.getCode();
    }
}