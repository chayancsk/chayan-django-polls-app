
# Internship Training Exercise

Welcome to the training exercise! This README will guide you through setting up your environment, working on assigned tasks, and contributing back to the repository.

## Prerequisites
- Git installed on your machine.
- A GitHub account.
- Basic knowledge of Git commands.

## Setting Up SSH and Cloning the Repository

### Generating SSH Key
1. Open your terminal.
2. Generate an SSH key pair using the command:
   ```
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
3. Press Enter to accept the default file location and filename.
4. Set a passphrase for the SSH key when prompted (optional).

### Adding SSH Key to GitHub
1. Copy the SSH public key to your clipboard. If you're on a Mac, you can use:
   ```
   pbcopy < ~/.ssh/id_rsa.pub
   ```
   On Windows, you can use a text editor to open the file and copy the contents.

2. Go to your GitHub account settings.
3. Click on 'SSH and GPG keys' and then 'New SSH key'.
4. Paste your SSH key and give it a meaningful title.

### Cloning the Repository
1. Navigate to the main page of the repository on GitHub.
2. Click on 'Code' and copy the SSH URL.
3. Clone the repository using:
   ```
   git clone [SSH URL]
   ```

## Workflow

### Creating Your Branch
1. Navigate to the cloned repository directory.
2. Create and checkout a new branch with your username:
   ```
   git checkout -b <your-username>
   ```

### Fixing Issues
1. Open the provided Python and Java files.
2. Locate the bugs (hints are provided as comments).
3. Fix the issues in the code.

### Committing and Pushing Changes
1. After fixing each bug, stage your changes:
   ```
   git add [file-name]
   ```
2. Commit your changes with a descriptive message:
   ```
   git commit -m "Describe the fix made"
   ```
3. Push your branch to the remote repository:
   ```
   git push origin <your-username>
   ```

### Creating a Pull Request
1. Go to the original repository on GitHub.
2. Click on 'Pull requests' and then 'New pull request'.
3. Select your branch and master/main branch as base
4. Provide a title and description for your pull request.
5. Click 'Create pull request'.

# Guidelines

## Commit Messages

Good commit messages serve as a summary of what changes were made and why, helping your team understand the project history at a glance!

### Structure of a Good Commit Message
1. **Subject Line**: The first line should be a brief summary (50 characters or less) of the change. It should be written in imperative mood ("Add feature" not "Added feature" or "Adds feature").
2. **Body**: If necessary, provide a more detailed explanation of your change. Wrap the body at 72 characters and explain the *what* and *why* of the changes, not the how.

### Tips for Writing Commit Messages
- Start the commit message with a capitalized verb in the present tense: Add, Fix, Update, Remove.
- If the change addresses an issue or ticket, include the reference number.
- Use the body to explain *what* and *why* instead of *how*.

Example of a Good Commit Message:
```
Fix bug causing application crash on login

Resolve an issue where the application would crash under certain conditions
during the login process due to a null pointer exception. This fix ensures
that the user object is checked for nullity before attempting to access its
properties.
```

## Pull Request Names

PR names (titles) should quickly inform reviewers about the nature of the changes. Similar to commit messages, they should be concise and descriptive.

### Tips for PR Titles
- Begin with the type of change (Fix, Add, Update, Remove).
- Clearly state the component or feature affected.
- Keep it short and descriptive.

Example:
```
Add User Authentication Flow
```

## Pull Request Descriptions

The description of a PR should provide all the information necessary for a reviewer to understand the changes, the context, and the reasoning behind them.

### Structure of a Good PR Description
1. **Summary**: Start with a brief summary of the changes.
2. **Motivation**: Explain the reason for the changes. What issue or problem is being addressed?
3. **Changes**: List the key changes made. Bullet points are helpful here.
4. **Testing**: Describe any testing that was performed to ensure the changes work as expected.
5. **Screenshots**: If applicable, include screenshots to show UI changes.
6. **Additional Notes**: Any other information that will help the reviewers understand the context.

### Tips for Writing PR Descriptions
- Use clear and concise language.
- Reference related issues or tickets using hashtags (e.g., #123).
- If the PR is incomplete or a work in progress, make that clear.

Example PR Description:
```
## Summary
This PR adds a new user authentication flow to the application, improving security and user experience.

## Motivation
We've received feedback about the complexity of the current login process. This update simplifies the authentication flow, making it more intuitive.

## Changes
- Implement OAuth 2.0
- Deprecate the old authentication system
- Update login and registration screens

## Testing
Tested on both iOS and Android devices, ensuring compatibility with existing user accounts.

## Screenshots
(If applicable, add screenshots)

## Additional Notes
Please review the changes by the end of the week. The update requires coordination with the mobile team for a simultaneous rollout.
```



Good luck with your tasks!

