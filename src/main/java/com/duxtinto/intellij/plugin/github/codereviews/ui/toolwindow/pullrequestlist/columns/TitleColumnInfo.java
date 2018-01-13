package com.duxtinto.intellij.plugin.github.codereviews.ui.toolwindow.pullrequestlist.columns;

import com.duxtinto.intellij.plugin.github.codereviews.domain.pullrequests.PullRequestEntity;
import com.intellij.util.ui.ColumnInfo;
import org.jetbrains.annotations.Nullable;

class TitleColumnInfo extends ColumnInfo<PullRequestEntity, String> {
    TitleColumnInfo() {
        super("title");
    }

    @Nullable
    @Override
    public String valueOf(PullRequestEntity pullRequest) {
        return pullRequest.title();
    }
}