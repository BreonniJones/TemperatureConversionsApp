package snippet;

public class Snippet {
	java.lang.NoClassDefFoundError: org/junit/runner/manipulation/Filter
		at java.base/java.lang.Class.forName0(Native Method)
		at java.base/java.lang.Class.forName(Class.java:413)
		at java.base/java.lang.Class.forName(Class.java:404)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.loadTestLoaderClass(RemoteTestRunner.java:381)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.createRawTestLoader(RemoteTestRunner.java:371)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.createLoader(RemoteTestRunner.java:366)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.defaultInit(RemoteTestRunner.java:310)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.init(RemoteTestRunner.java:225)
		at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
	Caused by: java.lang.ClassNotFoundException: org.junit.runner.manipulation.Filter
		at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
		at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
		at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
		... 9 more
	
}

