/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.templates.options;

import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.Validation;

public interface KafkaToPubsubOptions extends PipelineOptions {
  @Description("Kafka Bootstrap Servers")
  @Validation.Required
  String getBootstrapServers();

  void setBootstrapServers(String value);

  @Description("Kafka topics to read the input from")
  @Validation.Required
  String getInputTopics();

  void setInputTopics(String value);

  @Description(
      "The Cloud Pub/Sub topic to publish to. "
          + "The name should be in the format of "
          + "projects/<project-id>/topics/<topic-name>.")
  @Validation.Required
  String getOutputTopic();

  void setOutputTopic(String outputTopic);

  @Description("URL to credentials in Vault")
  String getSecretStoreUrl();

  void setSecretStoreUrl(String secretStoreUrl);

  @Description("Vault token")
  String getVaultToken();

  void setVaultToken(String vaultToken);
}
