/*
  Copyright 2012 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.test.profile.converter;

import junit.framework.TestCase;

import org.scribe.up.profile.converter.LongConverter;

/**
 * This class tests the {@link org.scribe.up.profile.converter.LongConverter} class.
 * 
 * @author Jerome Leleu
 * @since 1.2.0
 */
public final class TestLongConverter extends TestCase {
    
    private LongConverter converter = new LongConverter();
    
    private static final long VALUE = 1234567890123L;
    
    public void testNull() {
        assertNull(converter.convert(null));
    }
    
    public void testNotAStringNotAnInteger() {
        assertNull(converter.convert(Boolean.TRUE));
    }
    
    public void testLong() {
        assertEquals(VALUE, (long) converter.convert(VALUE));
    }
    
    public void testLongString() {
        assertEquals(VALUE, (long) converter.convert("" + VALUE));
    }
}
