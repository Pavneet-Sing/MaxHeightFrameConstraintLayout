<h1 align="center">MaxChildHeightFramelayout</h1>
<p align="center">
 <a href="https://jitpack.io/#Pavneet-Sing/MaxChildHeightFramelayout"> <img src="https://jitpack.io/v/Pavneet-Sing/MaxChildHeightFramelayout.svg" /></a>
   <a href="https://kotlinlang.org"> <img src="https://img.shields.io/badge/Kotlin-1.3.61-blue.svg" /></a>
  <a href="https://developer.android.com/guide/"> <img src="https://img.shields.io/badge/Platform-Android-green.svg" /></a>
  <a href="LICENSE/"> <img src="https://img.shields.io/badge/License-MIT-yellow.svg" /></a>
</p>

Introduction
------------
Custom frame-layout to retain the maximum height from (any)child fragment and use the same height to display other small fragments with extra height.

• Use-case: If you are using framelayout in any nested-scroll view then while replacing a bigger fragment with smaller one, will result in moving scroll view resize and scrolling which can be avoid by keeping the same height of bigger fragment while showing the small one.

### Normal Behaviour

<img src="https://user-images.githubusercontent.com/11755381/75091585-fdcfdb80-5594-11ea-913d-6024f40fe615.gif" width="350" height="600"/>

### MaxChildHeightFrameLayout
Either use `MaxChildHeightFrameLayout` as container or if you have more views which needs to be places right under the fragment then use

```
        <com.pavneet_singh.maxchildheightframelayout.MaxChildHeightFrameLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:minHeight="2dp"
            app:layout_constraintTop_toBottomOf="@+id/btn_show_green">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <FrameLayout
                    android:id="@+id/fragment_container"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content" />

                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:text="@string/additional_text_nmore_data"
                    android:textSize="24sp" />
            </LinearLayout>
        </com.pavneet_singh.maxchildheightframelayout.MaxChildHeightFrameLayout>

```


<img src="https://user-images.githubusercontent.com/11755381/75091134-112c7800-5590-11ea-8a7c-9c1e7c441b1f.gif" width="350" height="600"/>

Gradle Implementation
---------------------
1. Add JitPack to your project build.gradle

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
   }
}
```
2. Add the dependency in the app `build.gradle`

```gradle
dependencies {
    implementation 'com.github.Pavneet-Sing:MaxChildHeightFramelayout:version'
  }
```
e.g :

```
implementation 'com.github.Pavneet-Sing:MaxChildHeightFramelayout:1.0.0-beta01'
```

Contribution
-----------
• Pull requests and bug reports are welcome. For any major change, please open an issue first to discuss what you would like to change.

License
-------
```
MIT License

Copyright (c) 2020 Pavneet Singh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```