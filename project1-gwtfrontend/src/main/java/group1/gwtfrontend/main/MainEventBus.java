package group1.gwtfrontend.main;

import group1.gwtfrontend.main.presenters.impl.live.MainModuleLayoutManagerPresenter;

import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter = MainModuleLayoutManagerPresenter.class)
public interface MainEventBus extends EventBus {


}
