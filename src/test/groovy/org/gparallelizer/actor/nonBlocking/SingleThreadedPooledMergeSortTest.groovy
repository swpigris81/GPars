//  GParallelizer
//
//  Copyright © 2008-9  The original author or authors
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

package org.gparallelizer.actor.nonBlocking

import org.gparallelizer.actor.Actors

/**
 *
 * @author Vaclav Pech
 * Date: Feb 20, 2009
 */
public class SingleThreadedPooledMergeSortTest extends PooledMergeSortTest {

    protected void setUp() {
        super.setUp();
        Actors.defaultPooledActorGroup.resize(1)
    }

    protected void tearDown() {
        super.tearDown();
        Actors.defaultPooledActorGroup.resize(5)
    }
}