/*
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

package org.datatech.baikal.web.vo;

public class SourceDataFilterVO {

    private String source_schema;
    private String source_instance;
    private String source_table;
    private String source_tables;
    private String keyword;
    private Integer particleSize;
    private Integer start = 0;
    private Integer rows = 20;

    public String getSource_schema() {
        return source_schema;
    }

    public void setSource_schema(String source_schema) {
        this.source_schema = source_schema;
    }

    public String getSource_instance() {
        return source_instance;
    }

    public void setSource_instance(String source_instance) {
        this.source_instance = source_instance;
    }

    public String getSource_table() {
        return source_table;
    }

    public void setSource_table(String source_table) {
        this.source_table = source_table;
    }

    public String getSource_tables() {
        return source_tables;
    }

    public void setSource_tables(String source_tables) {
        this.source_tables = source_tables;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getParticleSize() {
        return particleSize;
    }

    public void setParticleSize(Integer particleSize) {
        this.particleSize = particleSize;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
