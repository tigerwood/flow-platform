/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.api.test.config;

import com.flow.platform.api.test.TestBase;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yang
 */
public class AppConfigTest extends TestBase {

    @Autowired
    private Path workingDir;

    @Test
    public void should_create_working_path() throws Throwable {
        Assert.assertTrue(Files.exists(workingDir));
    }

    @After
    public void after() throws Throwable {
        Files.delete(workingDir);
    }
}
