/*
 * Copyright (c) 2017. Louis Cognault Ayeva Derman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package splitties.preferences

import splitties.init.appCtx

/**
 * This should be overriden by only one object in an app.
 */
abstract class DefaultPreferences(
    availableAtDirectBoot: Boolean = false
) : Preferences(defaultPrefsName, availableAtDirectBoot) {

    private companion object {
        private val defaultPrefsName get() = "${appCtx.packageName}_preferences"
    }
}
