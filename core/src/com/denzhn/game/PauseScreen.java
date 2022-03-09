package com.denzhn.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class PauseScreen implements Screen {

    final DropGame game;
    final OrthographicCamera camera;
    final GameScreen gameScreen;

    public PauseScreen(DropGame game, GameScreen gameScreen) {
        this.game = game;
        this.gameScreen = gameScreen;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 400);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.font.draw(game.batch, "You paused the game.",320, 260);
        game.font.draw(game.batch, "Press C to continue the game", 320, 230);
        game.font.draw(game.batch, "Press Y button to close the game", 320, 200 );
        game.batch.end();

        if(Gdx.input.isKeyPressed(Input.Keys.Y)){
            Gdx.app.exit();
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.C)) {
            game.setScreen(gameScreen);
        }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
