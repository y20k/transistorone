/*
 * Copyright 2017 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// credit:
// https://medium.com/google-developers/audio-focus-3-cdc09da9c122 &
// https://gist.github.com/nic0lette/c360dd353c451d727ea017890cbaa521

package org.y20k.transistorone.helpers;

/**
 * {@code AudioFocusAwarePlayer} defines an interface for players
 * to respond to audio focus changes.
 */
public interface AudioFocusAwarePlayer {
    boolean isPlaying();
    void play();
    void pause();
    void stop();
    void setVolume(float volume);
}
