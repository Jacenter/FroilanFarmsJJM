# FroilanFarmsJJM
#Working Rules
#NEVER PUSH TO MASTER!
-Make a new branch in your CLI.
-Double and triple check your code.Before pushing to your branch, make sure to "git pull" to eliminate unnecessary merge conflicts.
-git status - Check what you did and what you changed.
-git add -A to add all the files changed (Must do this before commit!).
-git commit -m "" - to commit my changes with a message describing those changes. Be descriptive and honest about what you did, no joke messages.
-git push -u origin [branchname] - to push my changes to the github repo.
-Go to git hub and create pull request.
-When done with a task go to trello and move your task to the pending approval card so an admin can approve or request changes to it.
-After pull request is approved, it is moved to DONE on Trello. Start work on a new ticket or request a new ticket.

#ADMINS:
-When Reviewing Pull Requests
-Read what they said they changed.
-Switch to their branch on your IDE, and pull in their changes to your machine. 
-Use git fetch && git checkout [branchname] if you don't have their branch on your machine yet and then pull it.
-Go through it using IntelliJ to look for errors, but there still may be logical mistakes with no errors. So go through their classes one by one.
-If everything is ok, accept the pull request and merge it into master.
-If not, reject their request and inform them of issues.
-Delete their branch if the job is completely done.
-Move their ticket to done.
