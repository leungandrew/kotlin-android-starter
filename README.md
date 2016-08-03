# Kotlin Android Starter

## Purpose

The purpose of this starter project is to provide an opinionated basis of the libraries that are 
essential for starting a new Android project.

I feel like Kotlin is essential for building Android apps in the future.  Although the language
is very new to me, there are amazing libraries like Anko by Jetbrains that seems to simplify
a lot of the boilerplate that comes with using Java.  And since you can mix and match your Java
and Kotlin, may as well setup and drive out the project as much as possible, and only use Java as backup.

I was fed up with having to do the same setup over and over again so having this template will hopefully
make all the setup faster

## Essential Libraries

* Junit
* Picasso
* Retrofit
* Robolectric
* Anko
* RecyclerView

## Future Considerations

### Dagger?

Man Dagger is a pain to setup, but is it essential?

### Styleguide

Can we build an Android application where the styleguide is built separately as a library?  Is it useful?
Can Anko solve making styling better?

### Journey Testing

Should we be using Espresso more?  Perhaps it makes more sense to start with it first?  Can CI handle it well?
Has starting an emulator on a CI server improved since last time?

### Concourse CI

Can we utilize Concourse CI pipelines to test the Android app (Most likely the answer is yes)?  
Does a docker image already exist that will allow us to run the tests?
Does a docker image already exist that can run an emulator?
Can we integrate the Espresso test suite as part of integration tests?
Can we use Concourse CI and deploy to something like App Distribution?
