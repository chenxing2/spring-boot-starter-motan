/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.chenxing2.motan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Annotation Config
 * 
 * @author 	alanwei
 * @since 	2016-09-11
 */
@ConfigurationProperties(prefix = "motan.annotation")
public class AnnotationConfig {

	/** package */
	@Value("${motan.annotation.package}")
	private String scanPackage;

	/**
	 * @return the scanPackage
	 */
	public String getScanPackage() {
		return scanPackage;
	}

	/**
	 * @param scanPackage the scanPackage to set
	 */
	public void setScanPackage(String scanPackage) {
		this.scanPackage = scanPackage;
	}
}
