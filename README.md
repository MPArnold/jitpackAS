# jitpackAS

[![Release](https://jitpack.io/v/MPArnold/jitpackAS.svg)](https://jitpack.io/#MPArnold/jitpackAS)

Example Android library project published via jitpack.io.

See this [Tutorial](https://medium.com/@ome450901/publish-an-android-library-by-jitpack-a0342684cbd0) on how to publish an Android Library with JitPack.

NB: This sample uses the abandoned **android-maven** plugin. Refer [here](https://github.com/MPArnold/jitpackAS) for a sample using the new **maven-publish** [plugin](https://developer.android.com/studio/build/maven-publish-plugin).

**jitpack.io** is defined [here](https://github.com/jitpack/jitpack.io).

To deploy this example, add the following to your (project) build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and the following to your (app) build.gradle:

```gradle
dependencies {
    implementation 'com.github.MPArnold:jitpackAS:3.11@aar'
}
```

## Multiple build variants

If your library uses multiple flavours then see this example:
https://github.com/jitpack-io/android-jitpack-library-example

## Adding the (abandoned) maven plugin

To enable installing into local maven repository and JitPack you need to add the [android-maven](https://github.com/dcendents/android-maven-gradle-plugin) plugin:

1. Add `classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'` to root build.gradle under `buildscript { dependencies {`
2. Add `com.github.dcendents.android-maven` to the library/build.gradle

After these changes you should be able to run:

    ./gradlew install
    
from the root of your project. If install works and you have added a GitHub release it should work on jitpack.io

## Adding a sample app 

If you add a sample app to the same repo then your app needs to have a dependency on the library. To do this in your app/build.gradle add:

```gradle
    dependencies {
        compile project(':library')
    }
```
