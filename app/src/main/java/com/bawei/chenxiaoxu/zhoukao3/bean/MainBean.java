package com.bawei.chenxiaoxu.zhoukao3.bean;

import java.util.List;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/9/15.
 */

public class MainBean {

        private List<Pois> pois;

        public List<Pois> getPois() {
            return pois;
        }

        public void setPois(List<Pois> pois) {
            this.pois = pois;
        }

        public class Pois {
            private String name;

            private String distance;

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            private List<Photo> photos;

            public List<Photo> getPhotos() {
                return photos;
            }

            public void setPhotos(List<Photo> photos) {
                this.photos = photos;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public class Photo {
                private String url;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
}
