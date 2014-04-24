package om.flappyrobot.Screens;

import om.flappyrobot.GameWorld.GameRenderer;
import om.flappyrobot.GameWorld.GameWorld;
import om.flappyrobot.Helpers.InputHandler;

import com.badlogic.gdx.Gdx;

public class GameScreen extends AbstractScreen {

	private final GameWorld world;
	private final GameRenderer renderer;
	private float runTime;

	// This is the constructor, not the class declaration
	public GameScreen() {

		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth / gameWidth);
		int midPointY = (int) (gameHeight / 2);

		world = new GameWorld(midPointY);
		Gdx.input.setInputProcessor(new InputHandler(world, screenWidth / gameWidth, screenHeight / gameHeight));
		renderer = new GameRenderer(world, (int) gameHeight, midPointY);
		world.setRenderer(renderer);
	}

	@Override
	public void render(float delta) {
		runTime += delta;
		world.update(delta);
		renderer.render(delta, runTime);
	}
}
