package com.elegion.test.behancer.di.component;

import com.elegion.test.behancer.di.module.AppModule;
import com.elegion.test.behancer.di.module.NetworkModule;
import com.elegion.test.behancer.di.module.ProfileFragmentModule;
import com.elegion.test.behancer.di.module.ProjectsFragmentModule;
import com.elegion.test.behancer.ui.profile.ProfileFragment;
import com.elegion.test.behancer.ui.projects.ProjectsFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    ProfileFragmentSubComponent plusProfileFragment(ProfileFragmentModule module);
    ProjectsFragmentSubComponent plusProjectsFragment(ProjectsFragmentModule module);
}
