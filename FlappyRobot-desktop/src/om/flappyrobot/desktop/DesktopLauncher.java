package om.flappyrobot.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import om.flappyrobot.FlappyRobotGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flappy Robot";
		config.useGL30 = false;
		config.width = 1080 / 3;
		config.height = 1920 / 3;
		new LwjglApplication(new FlappyRobotGame(), config);
	}
}
