/*
 * Copyright (C) 2014-2015 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *   Wrapper for OpenCV module xfeatures2d, part of OpenCV_Contrib.
 *
 * @author Jarek Sacha
 */
@Properties(inherit = {opencv_calib3d.class, opencv_features2d.class, opencv_shape.class}, value = {
    @Platform(include = {"<opencv2/xfeatures2d.hpp>", "<opencv2/xfeatures2d/nonfree.hpp>"}, link = "opencv_xfeatures2d@.3.2"),
    @Platform(value = "windows", link = "opencv_xfeatures2d320")},
        target = "org.bytedeco.javacpp.opencv_xfeatures2d")
public class opencv_xfeatures2d implements InfoMapper {
    public void map(InfoMap infoMap) {
    }
}
