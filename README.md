[![Build Status](https://travis-ci.org/AEModernMCPort/Applied-Energistics-3.svg?branch=codename-andromeda)](https://travis-ci.org/AEModernMCPort/Applied-Energistics-3) [![Latest](http://github-release-version.herokuapp.com/github/AEModernMCPort/Applied-Energistics-3/release.svg?style=flat)](https://github.com/AEModernMCPort/Applied-Energistics-3/releases/latest)

![Logo](logo.gif)

# Applied Energistics 3

This repository is a WIP on Applied Energistics 3.

### Differences from AE2 (the beginning)

Applied Energistics 3 has a whole new modular structure described in a dedicated file - [structure.md](structure.md).
In this file you will also find repartition of AE features accross modules, along with features that were temporarily removed and ones that were removed and will not come back ヾ(^\_^).

### If you want to help us
- And **you are a modder** - We would appreciate you helping us port and fix the code. Everything that should be done is described here - [#113](https://github.com/AEModernMCPort/Applied-Energistics-3/issues/113). PR your changes to us and eventually, you will be invited to join our team!
- And **you are an artist** - Although the current issue is the code, we still have a ton of models to do. All models that have to be done are listed here - [#9](https://github.com/AEModernMCPort/Applied-Energistics-3/issues/9). PR your models and/or textures to us and eventually, you will be invited to join our team!
- And **you are neiter of above** - Join our [discord server](https://discord.gg/6ykqtkC)! Suggest ideas! And be ready to test and submit bugs once everything is fixed!

_Below is the old AE2 README kept for unknown purposes._

---

[Suggestion Guidelines](http://ae-mod.info/Suggestion-Guidelines/)

## Table of Contents

* [About](#about)
* [Contacts](#contacts)
* [License](#license)
* [Downloads](#downloads)
* [Installation](#installation)
* [Issues](#issues)
* [Building](#building)
* [Contribution](#contribution)
* [API](#applied-energistics-2-api)
* [Localization](#applied-energistics-2-localization)
* [Credits](#credits)

## About

A Mod about Matter, Energy and using them to conquer the world..

## Contacts

* [Website](http://ae-mod.info/) (for AE2)
* [IRC #appliedenergistics on esper.net](http://webchat.esper.net/?channels=appliedenergistics&prompt=1)
* [GitHub](https://github.com/AEModernMCPort/Applied-Energistics-3)
* [Discord](https://discord.gg/6ykqtkC)

## License

* Applied Energistics 2 API
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-MIT-red.svg?style=flat)](http://opensource.org/licenses/MIT)
* Applied Energistics 2
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-LGPLv3-blue.svg?style=flat)](https://raw.githubusercontent.com/AppliedEnergistics/Applied-Energistics-2/rv2/LICENSE)
* Textures and Models
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-CC%20BY--NC--SA%203.0-yellow.svg?style=flat)](https://creativecommons.org/licenses/by-nc-sa/3.0/)
* Text and Translations
  - [![License](https://img.shields.io/badge/License-No%20Restriction-green.svg?style=flat)](https://creativecommons.org/publicdomain/zero/1.0/)

## Downloads

Downloads for the AE2 can be found on [CurseForge](http://www.curse.com/mc-mods/minecraft/223794-applied-energistics-2) or on the [official website](http://ae-mod.info/Downloads/).

We don't have AE3 releases for now.

## Installation

You install this mod by putting it into the `minecraft/mods/` folder. It has no additional hard dependencies.

## Issues

have a suggestion for Applied Energistics 3?  Create an issue now!

1. Make sure your issue has not already been answered or fixed and you are using the latest version. Also think about whether your issue is a valid one before submitting it.
2. Go to [the issues page](https://github.com/AppliedEnergistics/Applied-Energistics-2/issues) and click [new issue](https://github.com/AppliedEnergistics/Applied-Energistics-2/issues/new)
3. Enter your a title of your issue (something that summarizes your issue), and then create a detailed description of the issue.
    * Do not tag it with something like `[Feature]` or `[Bug]`. When it is applicable, we will take care of it.
    * The following details are required. Not including them can cause the issue to be closed.
        * Forge version
        * AE2 version
        * Crash log, when reporting a crash (Please make sure to use [pastebin](http://pastebin.com/))
            * Do not post an excerpt of what you consider important, instead:
            * Post the full log
        * Other mods and their version, when reporting an issue between AE and another mod
            * Also consider updating these before submitting a new issue, it might be already fixed
        * A detailed description of the bug or feature
    * To further help in resolving your issues please try to include the follow if applicable:
        * What was expected?
        * How to reproduce the problem?
            * This is usually a great detail and allows us to fix it way faster
        * Server or Single Player?
        * Screen shots or Pictures of the problem
        * Mod Pack using and version?
            * Keep in mind that some mods might use an outdated version of AE2
            * If so you should report it to your modpack
5. Click `Submit New Issue`, and wait for feedback!

Providing as many details as possible does help us to find and resolve the issue faster and also you getting a fixed version as fast as possible.

## Building

1. Clone this repository via 
  - SSH `git clone git@github.com:AEModernMCPort/Applied-Energistics-3.git` or 
  - HTTPS `git clone https://github.com/AEModernMCPort/Applied-Energistics-3.git`
2. Setup workspace 
  - Decompiled source `gradlew setupDecompWorkspace`
  - Obfuscated source `gradlew setupDevWorkspace`
  - CI server `gradlew setupCIWorkspace`
3. Build `gradlew build`. Jar will be in `build/libs`
4. For core developer: Setup IDE
  - IntelliJ: Import into IDE and execute `gradlew genIntellijRuns` afterwards
  - Eclipse: execute `gradlew eclipse`
5. For add-on developer: Core-Mod Detection
  - In order to have FML detect AE from your dev environment, add the following VM Option to your run profile
  - `-Dfml.coreMods.load=appeng.transformer.AppEngCore`

## Contribution

Before you want to add major changes, you might want to discuss them with us first, before wasting your time.
If you are still willing to contribute to this project, you can contribute via [Pull-Request](https://help.github.com/articles/creating-a-pull-request).

The [guidelines for contributing](https://github.com/AppliedEnergistics/Applied-Energistics-2/blob/master/CONTRIBUTING.md) contain more detailed information about topics like the used code style and should also be considered.

Here are a few things to keep in mind that will help get your PR approved.

* A PR should be focused on content. Any PRs where the changes are only syntax will be rejected.
* Use the file you are editing as a style guide.
* Consider your feature. [Suggestion Guidelines](http://ae-mod.info/Suggestion-Guidelines/)
  - Is your suggestion already possible using Vanilla + AE2?
  - Make sure your feature isn't already in the works, or hasn't been rejected previously.
  - Does your feature simplify another feature of AE2? These changes will not be accepted.
  - If your feature can be done by any popular mod, discuss with us first.

Getting Started

1. Fork this repository
2. Clone the fork via
  * SSH `git clone git@github.com:<your username>/Applied-Energistics-2.git` or 
  * HTTPS `git clone https://github.com/<your username>/Applied-Energistics-2.git`
3. Change code base
4. Add changes to git `git add -A`
5. Commit changes to your clone `git commit -m "<summery of made changes>"`
6. Push to your fork `git push`
7. Create a Pull-Request on GitHub
8. Wait for review
9. Squash commits for cleaner history

If you are only doing single file pull requests, GitHub supports using a quick way without the need of cloning your fork. Also read up about [synching](https://help.github.com/articles/syncing-a-fork) if you plan to contribute on regular basis.

## Applied Energistics 2 API

The API for Applied Energistics 2. It is open source to discuss changes, improve documentation, and provide better add-on support in general.

Development and standard builds can be obtained [Here](http://ae2.ae-mod.info/Downloads/).

### Maven

When compiling against the AE2 API you can use gradle dependencies, just add

    dependencies {
        compile "appeng:appliedenergistics2:rv_-_____-__:dev"
    }

or add the compile line to your existing dependencies task to your build.gradle

Where the __ are filled in with the correct version criteria; AE2 is available from the default forge maven so no additional repositories are necessary.

An example string would be `appeng:appliedenergistics2:rv2-alpha-30:dev`

## Applied Energistics 2 Localization

### English Text

`en_US` is included in this repository, fixes to typos are welcome.

### Encoding

Files must be encoded as UTF-8.

### New Translations

You can provide any additional languages by creating a new file with the [appropriate language code](http://download1.parallels.com/SiteBuilder/Windows/docs/3.2/en_US/sitebulder-3.2-win-sdk-localization-pack-creation-guide/30801.htm).

### Final Note

If you have have issues localizing something feel free to contact us on IRC, at #AppliedEnergistics on Esper.net

Thanks to everyone helping out to improve localization of AE2.

## Credits

Thanks to
 
* Notch et al for Minecraft
* Lex et al for MinecraftForge
* AlgorithmX2 for AppliedEnergistics2
* all [contributors](https://github.com/AppliedEnergistics/Applied-Energistics-2/graphs/contributors)
