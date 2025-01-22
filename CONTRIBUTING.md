# Contributing to Super Order Billing

Welcome to the Super Order Billing contributing guide. This comprehensive document outlines how to contribute effectively to improve the Self Service Android Application, from reporting issues to submitting code changes.

The [Open Source Guides](https://opensource.guide/) website has a collection of resources for individuals, communities, and companies who want to learn how to run and contribute to an open source project. Contributors and people new to open source alike will find the following guides especially useful:

- [How to Contribute to Open Source](https://opensource.guide/how-to-contribute/)
- [Building Welcoming Communities](https://opensource.guide/building-community/)

## Code of Conduct

We have adopted a Code of Conduct that we expect project participants to adhere to. Please read [the full text](CODE_OF_CONDUCT.md) so that you can understand what actions will and will not be tolerated.

## Development

### Pre-requisites
- Install [Android Studio](https://developer.android.com/studio)
- Install [Git](https://git-scm.com/downloads)
- Install JDK 17 or higher

For more information, see the [Development Setup](https://github.com/openMF/kmp-project-template/wiki/Set-up-an-environment) guide.

### Building the Code

Before you begin, you should have already downloaded the Android Studio SDK and set it up correctly. You can find a guide on how to do this here: [Setting up Android Studio](http://developer.android.com/sdk/installing/index.html?pkg=studio).

To Setup the project, follow the steps below:
- [Fork the Repository](https://github.com/openMF/kmp-project-template/wiki/Project-Setup#step-1-fork-the-repository)
- [Clone Your Forked Repository on Android Studio](https://github.com/openMF/kmp-project-template/wiki/Project-Setup#step-2-clone-your-forked-repository)
- [Set Up Your Development Branch](https://github.com/openMF/kmp-project-template/wiki/Project-Setup#step-3-set-up-your-development-branch)

### Code Conventions

- **Most important: Look around.** Match the style you see used in the rest of the project. This includes formatting, naming files, naming things in code, naming things in documentation, etc.
- "Attractive"
- We do have Prettier (a formatter) and ESLint (a syntax linter) to catch most stylistic problems. If you are working locally, they should automatically fix some issues during every git commit.
- **For documentation**: Do not wrap lines at 80 characters - configure your editor to soft-wrap when editing documentation.

Don't worry too much about styles in general—the maintainers will help you fix them as they review your code.

## Pull Requests

So you have decided to contribute code back to upstream by opening a pull request. You've invested a good chunk of time, and we appreciate it. We will do our best to work with you and get the PR looked at.

Working on your first Pull Request? You can learn how from this free video series:

[**How to Contribute to an Open Source Project on GitHub**](https://egghead.io/courses/how-to-contribute-to-an-open-source-project-on-github)

Please make sure the following is done when submitting a pull request:

1. **Keep your PR small.** Small pull requests (~300 lines of diff) are much easier to review and more likely to get merged. Make sure the PR does only one thing, otherwise please split it.
2. **Use descriptive titles.** It is recommended to follow this [commit message style](#semantic-commit-messages).
3. **Test your changes.** Describe your [**test plan**](#test-plan) in your pull request description.

All pull requests should be opened against the `development` branch.

We have a lot of integration systems that run automated tests to guard against mistakes. The maintainers will also review your code and fix obvious issues for you. These systems' duty is to make you worry as little about the chores as possible. Your code contributions are more important than sticking to any procedures, although completing the checklist will surely save everyone's time.

### Semantic Commit Messages

See how a minor change to your commit message style can make you a better programmer.

Format: `<type>(<scope>): <subject>`

`<scope>` is optional. If your change is specific to one/two packages, consider adding the scope. Scopes should be brief but recognizable, e.g. `content-docs`, `theme-classic`, `core`

The various types of commits:

- `feat`: a new API or behavior **for the end user**.
- `fix`: a bug fix **for the end user**.
- `docs`: a change to the website or other Markdown documents in our repo.
- `refactor`: a change to production code that leads to no behavior difference, e.g. splitting files, renaming internal variables, improving code style...
- `test`: adding missing tests, refactoring tests; no production code change.
- `chore`: upgrading dependencies, releasing new versions... Chores that are **regularly done** for maintenance purposes.
- `misc`: anything else that doesn't change production code, yet is not `test` or `chore`. e.g. updating GitHub actions workflow.

Do not get too stressed about PR titles, however. Your PR will be squash-merged and your commit to the `main` branch will get the title of your PR, so commits within a branch don't need to be semantically named. The maintainers will help you get the PR title right, and we also have a PR label system that doesn't equate with the commit message types. Your code is more important than conventions!

Example:

```
feat(core): allow overriding of webpack config
^--^^----^  ^------------^
|   |       |
|   |       +-> Summary in present tense. Use lower case not title case!
|   |
|   +-> The package(s) that this change affected.
|
+-------> Type: see above for the list we use.
```

### Test Plan

A good test plan has the exact commands you ran and their output and provides screenshots or videos if the pull request changes UI.

Tests are integrated into our continuous integration system, so you don't always need to run local tests. However, for significant code changes, it saves both your and the maintainers' time if you can do exhaustive tests locally first to make sure your PR is in good shape. There are many types of tests:

In MacOS, Windows or Linux, you should run the following commands before opening a PR, and make sure to pass all the commands:

* `./gradlew check -p build-logic` this checks build-logic configured properly.</br>
* `./gradlew spotlessApply --no-configuration-cache` an check and apply formatting to any file.</br>
* `./gradlew dependencyGuardBaseline`  to generate dependency-guard baseline.</br>
* `./gradlew detekt`  to check detekt error.</br>
* `./gradlew build` to build the project.</br>
* `./gradlew updateProdReleaseBadging` to update the badging for the project.</br>

*Or Run the `ci-prepush.sh` or `ci-prepush.bat` script to run all required checks in sequence.*