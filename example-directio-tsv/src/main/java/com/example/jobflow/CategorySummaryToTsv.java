/**
 * Copyright 2011-2016 Asakusa Framework Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.jobflow;

import java.util.Arrays;
import java.util.List;

import com.example.modelgen.dmdl.tsv.AbstractCategorySummaryTsvOutputDescription;

/**
 * カテゴリ別集計結果をDirect I/Oで出力する。
 * 出力ファイルは {@code result/category} 上の {@code result.tsv}。
 */
public class CategorySummaryToTsv extends AbstractCategorySummaryTsvOutputDescription {

    @Override
    public String getBasePath() {
        return "result/category";
    }

    @Override
    public String getResourcePattern() {
        return "result.tsv.gz";
    }

    @Override
    public List<String> getOrder() {
        return Arrays.asList("-selling_price_total");
    }

    @Override
    public List<String> getDeletePatterns() {
        return Arrays.asList("*");
    }
}
