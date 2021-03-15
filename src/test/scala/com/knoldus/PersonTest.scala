// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {

  //scalastyle:off magic.number

  it should " true for two persons  " in {
    val person1 = new Person("Utkarsh", 10)
    val person2 = new Person("Utkarsh", 20)
    assert((person1 < person2 == true))
  }

  it should " false for two persons  " in {
    val person1 = new Person("Utkarsh Upadhyay", 10)
    val person2 = new Person("Utkarsh", 20)
    assert((person1 < person2 == false))
  }

  //negative test case
  it should " return correct value for two persons  " in {
    val person1 = new Person("Utkarsh", 30)
    val person2 = new Person("Utkarsh", 20)
    assert((person1 < person2 != true))
  }
}

