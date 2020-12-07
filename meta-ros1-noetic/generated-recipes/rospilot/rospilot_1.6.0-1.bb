# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rospilot"
AUTHOR = "Christopher Berner <christopherberner@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "rospilot"
ROS_BPN = "rospilot"

ROS_BUILD_DEPENDS = " \
    ffmpeg \
    geometry-msgs \
    libgphoto2 \
    libjpeg-turbo \
    libmicrohttpd \
    libnl \
    message-generation \
    opencv \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gdal-bin} \
    ${ROS_UNRESOLVED_DEP-mapnik-utils} \
    ${ROS_UNRESOLVED_DEP-osm2pgsql} \
    ${ROS_UNRESOLVED_DEP-postgresql-postgis} \
    ${ROS_UNRESOLVED_DEP-python3-cherrypy3} \
    ${ROS_UNRESOLVED_DEP-python3-mapnik} \
    curl \
    dnsmasq \
    geometry-msgs \
    hostapd \
    libnl \
    mavlink \
    message-runtime \
    python3-colorama \
    python3-psutil \
    python3-pyserial \
    rosbash \
    rosbridge-suite \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    unzip \
    vision-opencv \
    wget \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gdal-bin} \
    ${ROS_UNRESOLVED_DEP-mapnik-utils} \
    ${ROS_UNRESOLVED_DEP-osm2pgsql} \
    ${ROS_UNRESOLVED_DEP-postgresql-postgis} \
    ${ROS_UNRESOLVED_DEP-python3-cherrypy3} \
    ${ROS_UNRESOLVED_DEP-python3-mapnik} \
    curl \
    dnsmasq \
    geometry-msgs \
    hostapd \
    libnl \
    mavlink \
    message-runtime \
    python3-colorama \
    python3-psutil \
    python3-pyserial \
    rosbash \
    rosbridge-suite \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    unzip \
    vision-opencv \
    wget \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rospilot/rospilot-release/archive/release/noetic/rospilot/1.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rospilot"
SRC_URI = "git://github.com/rospilot/rospilot-release;${ROS_BRANCH};protocol=https"
SRCREV = "662c06e9dc39452c7c1b5ab54d9d577cff5daa48"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}