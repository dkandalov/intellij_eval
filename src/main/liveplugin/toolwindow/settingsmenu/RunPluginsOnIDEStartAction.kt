package liveplugin.toolwindow.settingsmenu

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.ToggleAction
import com.intellij.openapi.project.DumbAware
import liveplugin.Settings

class RunPluginsOnIDEStartAction: ToggleAction(
    "Run Plugins on IDE Start",
    "Run all plugins in the Plugins toolwindow on IDE start. Note that this might slow down IDE startup.",
    null
), DumbAware {
    override fun isSelected(event: AnActionEvent) =
        Settings.instance.runAllPluginsOnIDEStartup

    override fun setSelected(event: AnActionEvent, state: Boolean) {
        Settings.instance.runAllPluginsOnIDEStartup = state
    }
}
