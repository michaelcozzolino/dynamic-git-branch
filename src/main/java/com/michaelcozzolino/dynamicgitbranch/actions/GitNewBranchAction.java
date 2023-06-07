package com.michaelcozzolino.dynamicgitbranch.actions;


import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

class GitNewBranchAction extends DumbAwareAction {
    public GitNewBranchAction() {

    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        e.getActionManager().getAction("Git.New.Branch.In.Log").actionPerformed(e);
    }

    /**
     * Determines whether this menu item is available for the current context.
     * Requires a project to be open.
     *
     * @param e Event received when the associated group-id menu is chosen.
     */
    @Override
    public void update(AnActionEvent e) {
        // Set the availability based on whether a project is open
        Project project = e.getProject();
        e.getPresentation().setEnabledAndVisible(project != null);
    }
}
