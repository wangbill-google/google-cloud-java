/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.GlobalAddressClient.ListGlobalAddressesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.GlobalAddressStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link GlobalAddressClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteGlobalAddress to 30 seconds:
 *
 * <pre>
 * <code>
 * GlobalAddressSettings.Builder globalAddressSettingsBuilder =
 *     GlobalAddressSettings.newBuilder();
 * globalAddressSettingsBuilder.deleteGlobalAddressSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * GlobalAddressSettings globalAddressSettings = globalAddressSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class GlobalAddressSettings extends ClientSettings<GlobalAddressSettings> {
  /** Returns the object with the settings used for calls to deleteGlobalAddress. */
  public UnaryCallSettings<DeleteGlobalAddressHttpRequest, Operation>
      deleteGlobalAddressSettings() {
    return ((GlobalAddressStubSettings) getStubSettings()).deleteGlobalAddressSettings();
  }

  /** Returns the object with the settings used for calls to getGlobalAddress. */
  public UnaryCallSettings<GetGlobalAddressHttpRequest, Address> getGlobalAddressSettings() {
    return ((GlobalAddressStubSettings) getStubSettings()).getGlobalAddressSettings();
  }

  /** Returns the object with the settings used for calls to insertGlobalAddress. */
  public UnaryCallSettings<InsertGlobalAddressHttpRequest, Operation>
      insertGlobalAddressSettings() {
    return ((GlobalAddressStubSettings) getStubSettings()).insertGlobalAddressSettings();
  }

  /** Returns the object with the settings used for calls to listGlobalAddresses. */
  public PagedCallSettings<
          ListGlobalAddressesHttpRequest, AddressList, ListGlobalAddressesPagedResponse>
      listGlobalAddressesSettings() {
    return ((GlobalAddressStubSettings) getStubSettings()).listGlobalAddressesSettings();
  }

  public static final GlobalAddressSettings create(GlobalAddressStubSettings stub)
      throws IOException {
    return new GlobalAddressSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GlobalAddressStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GlobalAddressStubSettings.getDefaultEndpoint();
  }
  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return GlobalAddressStubSettings.getDefaultServicePort();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GlobalAddressStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GlobalAddressStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return GlobalAddressStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GlobalAddressStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GlobalAddressStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected GlobalAddressSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GlobalAddressSettings. */
  public static class Builder extends ClientSettings.Builder<GlobalAddressSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(GlobalAddressStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(GlobalAddressStubSettings.newBuilder());
    }

    protected Builder(GlobalAddressSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GlobalAddressStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public GlobalAddressStubSettings.Builder getStubSettingsBuilder() {
      return ((GlobalAddressStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to deleteGlobalAddress. */
    public UnaryCallSettings.Builder<DeleteGlobalAddressHttpRequest, Operation>
        deleteGlobalAddressSettings() {
      return getStubSettingsBuilder().deleteGlobalAddressSettings();
    }

    /** Returns the builder for the settings used for calls to getGlobalAddress. */
    public UnaryCallSettings.Builder<GetGlobalAddressHttpRequest, Address>
        getGlobalAddressSettings() {
      return getStubSettingsBuilder().getGlobalAddressSettings();
    }

    /** Returns the builder for the settings used for calls to insertGlobalAddress. */
    public UnaryCallSettings.Builder<InsertGlobalAddressHttpRequest, Operation>
        insertGlobalAddressSettings() {
      return getStubSettingsBuilder().insertGlobalAddressSettings();
    }

    /** Returns the builder for the settings used for calls to listGlobalAddresses. */
    public PagedCallSettings.Builder<
            ListGlobalAddressesHttpRequest, AddressList, ListGlobalAddressesPagedResponse>
        listGlobalAddressesSettings() {
      return getStubSettingsBuilder().listGlobalAddressesSettings();
    }

    @Override
    public GlobalAddressSettings build() throws IOException {
      return new GlobalAddressSettings(this);
    }
  }
}
