package om.flappyrobot;

import om.flappyrobot.Helpers.AssetLoader;
import om.flappyrobot.Screens.SplashScreen;

import com.badlogic.gdx.Game;

public class FlappyRobotGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}
