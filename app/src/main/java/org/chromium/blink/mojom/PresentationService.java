
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/presentation/presentation.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface PresentationService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PresentationService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PresentationService, PresentationService.Proxy> MANAGER = PresentationService_Internal.MANAGER;


    void setController(
PresentationController controller);



    void setReceiver(
PresentationReceiver receiver);



    void setDefaultPresentationUrls(
org.chromium.url.mojom.Url[] presentationUrls);



    void listenForScreenAvailability(
org.chromium.url.mojom.Url availabilityUrl);



    void stopListeningForScreenAvailability(
org.chromium.url.mojom.Url availabilityUrl);



    void startPresentation(
org.chromium.url.mojom.Url[] presentationUrls, 
StartPresentationResponse callback);

    interface StartPresentationResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<PresentationConnectionResult, PresentationError> { }



    void reconnectPresentation(
org.chromium.url.mojom.Url[] presentationUrls, String presentationId, 
ReconnectPresentationResponse callback);

    interface ReconnectPresentationResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<PresentationConnectionResult, PresentationError> { }



    void closeConnection(
org.chromium.url.mojom.Url presentationUrl, String presentationId);



    void terminate(
org.chromium.url.mojom.Url presentationUrl, String presentationId);


}
