package org.ryuu.learn.gdx.kvpersistence;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.ryuu.learn.gdx.kvpersistence.LearnGdxKvPersistence;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("learn-gdx-kv-persistence");
		new Lwjgl3Application(new LearnGdxKvPersistence(), config);
	}
}
