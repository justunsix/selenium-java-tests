FROM gitpod/workspace-full

# install Chrome per https://github.com/JesterOrNot/Gitpod-Chrome/blob/master/.gitpod.Dockerfile
USER gitpod

RUN sudo apt-get -q update && \
    sudo apt-get install -yq chromium-browser && \
    sudo rm -rf /var/lib/apt/lists/*