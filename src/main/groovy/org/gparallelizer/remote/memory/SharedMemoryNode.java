//  GParallelizer
//
//  Copyright © 2008-9 Vaclav Pech
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License. 

package org.gparallelizer.remote.memory;

import org.gparallelizer.remote.RemoteNode;
import org.gparallelizer.remote.LocalNode;
import org.gparallelizer.remote.RemoteActor;
import org.gparallelizer.actors.ActorMessage;

import java.io.Serializable;
import java.io.IOException;
import java.util.UUID;

public class SharedMemoryNode extends MemoryNode {
    public SharedMemoryNode(LocalNode node) {
        super(node);
    }

    public void send(RemoteActor receiver, ActorMessage<Serializable> message) {
        throw new UnsupportedOperationException();
    }

    protected RemoteActor createRemoteActor(UUID uid) {
        if (uid == RemoteNode.MAIN_ACTOR_ID)
            return new SharedMemoryActor(this, localNode.getMainActor());

        throw new UnsupportedOperationException();
    }

    protected void deliver(byte[] bytes) throws IOException {
        throw new UnsupportedOperationException();
    }
}