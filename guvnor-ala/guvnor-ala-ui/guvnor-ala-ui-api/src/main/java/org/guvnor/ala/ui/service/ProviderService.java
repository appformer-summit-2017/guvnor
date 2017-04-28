/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.ala.ui.service;

import java.util.Collection;

import org.jboss.errai.bus.server.annotations.Remote;
import org.guvnor.ala.ui.model.Provider;
import org.guvnor.ala.ui.model.ProviderConfiguration;
import org.guvnor.ala.ui.model.ProviderKey;
import org.guvnor.ala.ui.model.ProviderType;

@Remote
public interface ProviderService {

    Collection< Provider > getProviders( final ProviderType providerType );

    Collection< ProviderKey > getProvidersKey( final ProviderType providerType );

    boolean isValidProvider( final ProviderType providerType,
                             final String id,
                             final String name );

    void createProvider( final ProviderType providerType,
                         final ProviderConfiguration configuration );

    void deleteProvider( final ProviderKey providerKey );

    Provider getProvider( final ProviderKey providerKey );

}