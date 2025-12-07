This repository will show you how to add new script_wrappers into Hold My Items 1.21.8.

Download the Required Files

First, download Hold My Items and LuaJ (JSE).

Hold My Items:
https://modrinth.com/mod/hold-my-items/version/5.0L4

LuaJ:
https://github.com/luaj/luaj/releases/tag/v3.0.2

 it is important that you download the JSE JAR, not the JME version.



Next, create a new folder in your source root and name it something like:  libs


in the libs folder add the jars that YOU just downloaded

In your build.gradle, add these two lines inside the dependencies block.
These will implement the mods as dependencies:

modImplementation files("libs/(HMI NAME).jar")
implementation files("libs/(JSE NAME).jar")

For example, I renamed them for easier use:

modImplementation files("libs/HMI.jar")
implementation files("libs/jse.jar")

 That’s all!

Now, go check ExampleInjector for the next steps.
And that’s it  you have successfully created a new addon for Hold My Items!