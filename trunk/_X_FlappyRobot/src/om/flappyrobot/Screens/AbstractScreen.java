package om.flappyrobot.Screens;

import com.badlogic.gdx.Screen;

abstract class AbstractScreen implements Screen {

	@Override
	public abstract void render(float delta);

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}
}
