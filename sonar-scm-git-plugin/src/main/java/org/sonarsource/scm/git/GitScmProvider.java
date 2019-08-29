/*
 * SonarQube :: Plugins :: SCM :: Git
 * Copyright (C) 2014-2019 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.scm.git;

import java.nio.file.Path;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public class GitScmProvider extends GitScmProviderBefore80 {
  public GitScmProvider(JGitBlameCommand jgitBlameCommand, AnalysisWarningsWrapper analysisWarnings, GitIgnoreCommand gitIgnoreCommand) {
    super(jgitBlameCommand, analysisWarnings, gitIgnoreCommand);
  }

  @CheckForNull
  public Set<Path> branchChangedFiles(ForkPoint forkPoint, Path rootBaseDir) {
    return super.branchChangedFiles(forkPoint, rootBaseDir);
  }

  @CheckForNull
  protected Map<Path, Set<Integer>> branchChangedLines(ForkPoint forkPoint, Path projectBaseDir, Set<Path> changedFiles) {
    return super.branchChangedLines(forkPoint, projectBaseDir, changedFiles);
  }
}
